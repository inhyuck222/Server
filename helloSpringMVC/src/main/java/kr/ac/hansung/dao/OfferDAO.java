package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("offerDAO")
public class OfferDAO {
	
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount(){
		String sqlStatement = "select count(*) from offers";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	//Querying and returning a single object
	public Offer getOffer(String name){
		String sqlStatment = "SELECT * FROM offers WHERE name=?";

		//queryForObject�� �ϳ��� record�� �о�ͼ� �Ҵ� �ϴ� ��
		return jdbcTemplateObject.queryForObject(sqlStatment,new Object[]{name}, new OfferMapper()); 
	}
	
	public List<Offer> getOffers(){
		String sqlStatment = "SELECT * FROM offers";

		//query�� �������� record�� �о�ͼ� �Ҵ� �ϴ� ��
		return jdbcTemplateObject.query(sqlStatment, new RowMapper<Offer>() {

			//database���� �о�� ResultSet���� key ���� ã�Ƽ� ��ü�� �Ҵ� ���ִ� ����
			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));
				return offer;
			}
		});
	}
	
	public boolean insert(Offer offer){
		String sqlStatement = "INSERT INTO offers (name, email, text) VALUES (?,?,?)";
		
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{name, email, text}) == 1);
	}
	
	public boolean update(Offer offer){
		String sqlStatement = "UPDATE offers SET name=?, email=?, text=? WHERE id=?";
		
		int id = offer.getId();
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{name, email, text, id}) == 1);
	}
	
	public boolean delete(int id){
		String sqlStatement = "DELETE FROM offers WHERE id=?";
		
		return (jdbcTemplateObject.update(sqlStatement, id) == 1);
	}
	
}