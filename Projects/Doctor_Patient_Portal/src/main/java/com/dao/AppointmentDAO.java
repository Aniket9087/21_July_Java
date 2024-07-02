package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Appointment;


public class AppointmentDAO {

	private Connection conn;

	public AppointmentDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addAppointment(Appointment appointment) {

		boolean f = false;

		try {

			String sql = "insert into appointment(userId, fullName, gender, age, appointmentDate, email, phone, diseases, id, address, status) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);

			pstmt.setInt(1, appointment.getUserId());
			pstmt.setString(2, appointment.getFullName());
			pstmt.setString(3, appointment.getGender());
			pstmt.setString(4, appointment.getAge());
			pstmt.setString(5, appointment.getAppointmentDate());
			pstmt.setString(6, appointment.getEmail());
			pstmt.setString(7, appointment.getPhone());
			pstmt.setString(8, appointment.getDiseases());
			pstmt.setInt(9, appointment.getDoctorId());
			pstmt.setString(10, appointment.getAddress());
			pstmt.setString(11, appointment.getStatus());

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Appointment> getAllAppointmentByLoginUser(int userId) {
		List<Appointment> appList = new ArrayList<Appointment>();

		Appointment app = null;

		try {

			String sql = "select * from appointment where userId=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);

			pstmt.setInt(1, userId);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {

				app = new Appointment();

				app.setId(resultSet.getInt(1));
				app.setUserId(resultSet.getInt(2));
				app.setFullName(resultSet.getString(3));
				app.setGender(resultSet.getString(4));
				app.setAge(resultSet.getString(5));
				app.setAppointmentDate(resultSet.getString(6));
				app.setEmail(resultSet.getString(7));
				app.setPhone(resultSet.getString(8));
				app.setDiseases(resultSet.getString(9));
				app.setAddress(resultSet.getString(10));
				app.setStatus(resultSet.getString(11));
				app.setDoctorId(resultSet.getInt(12));
				appList.add(app);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return appList;

	}


	public List<Appointment> getAllAppointmentByLoginDoctor(int doctorId) {
		List<Appointment> appList = new ArrayList<Appointment>();

		Appointment app = null;

		try {

			String sql = "select * from appointment where id=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);

			pstmt.setInt(1, doctorId);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {

				app = new Appointment();

				app.setId(resultSet.getInt(1));
				app.setUserId(resultSet.getInt(2));
				app.setFullName(resultSet.getString(3));
				app.setGender(resultSet.getString(4));
				app.setAge(resultSet.getString(5));
				app.setAppointmentDate(resultSet.getString(6));
				app.setEmail(resultSet.getString(7));
				app.setPhone(resultSet.getString(8));
				app.setDiseases(resultSet.getString(9));
				app.setAddress(resultSet.getString(10));
				app.setStatus(resultSet.getString(11));
				app.setDoctorId(resultSet.getInt(12));
				appList.add(app);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return appList;

	}


	public Appointment getAppointmentById(int id) {

		Appointment app = null;

		try {

			String sql = "select * from appointment where apid=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);

			pstmt.setInt(1, id);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {

				app = new Appointment();

				app.setId(resultSet.getInt(1));// appoint id
				app.setUserId(resultSet.getInt(2));// userId
				app.setFullName(resultSet.getString(3));
				app.setGender(resultSet.getString(4));
				app.setAge(resultSet.getString(5));
				app.setAppointmentDate(resultSet.getString(6));
				app.setEmail(resultSet.getString(7));
				app.setPhone(resultSet.getString(8));
				app.setDiseases(resultSet.getString(9));
				app.setAddress(resultSet.getString(10));
				app.setStatus(resultSet.getString(11));
				app.setDoctorId(resultSet.getInt(12));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return app;

	}

	public boolean updateDrAppointmentCommentStatus(int apptId, int docId, String comment) {

		boolean f = false;

		try {

			String sql = "update appointment set status=? where apid=? and id=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, comment);
			pstmt.setInt(2, apptId);
			pstmt.setInt(3, docId);

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Appointment> getAllAppointment() {
		List<Appointment> appList = new ArrayList<Appointment>();
		Appointment app = null;

		try {

			 String sql = "select * from appointment order by id desc"; 
			 String sql1 = "select * from appointment order by created_at desc"; 
			
			String sql2 = "select * from appointment order by appointmentDate desc";


			PreparedStatement pstmt = this.conn.prepareStatement(sql);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {

				app = new Appointment();

				app.setId(resultSet.getInt(1));// appoint id
				app.setUserId(resultSet.getInt(2));// userId
				app.setFullName(resultSet.getString(3));
				app.setGender(resultSet.getString(4));
				app.setAge(resultSet.getString(5));
				app.setAppointmentDate(resultSet.getString(6));
				app.setEmail(resultSet.getString(7));
				app.setPhone(resultSet.getString(8));
				app.setDiseases(resultSet.getString(9));
				app.setAddress(resultSet.getString(10));
				app.setStatus(resultSet.getString(11));
				app.setDoctorId(resultSet.getInt(12));
				appList.add(app);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return appList;
	}

}
