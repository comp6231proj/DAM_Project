package DAM;


/**
* DAM/DAMCORBAInterfaceOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013年3月15日 星期五 下午06时01分34秒 EDT
*/

public interface DAMCORBAInterfaceOperations 
{
  String reserve (String medicareID, String timeSlot);
  String cancel (String medicareID, String timeSlot);
  String checkTimeSlot (String timeSlot);
  String changeAppt (String medicareID, String timeSlot, String desiredTimeSlot, String desiredClinicID);
} // interface DAMCORBAInterfaceOperations
