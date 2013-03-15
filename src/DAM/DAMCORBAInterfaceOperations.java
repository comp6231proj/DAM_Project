package DAM;


/**
* DAM/DAMCORBAInterfaceOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013��3��15�� ������ ����06ʱ01��34�� EDT
*/

public interface DAMCORBAInterfaceOperations 
{
  String reserve (String medicareID, String timeSlot);
  String cancel (String medicareID, String timeSlot);
  String checkTimeSlot (String timeSlot);
  String changeAppt (String medicareID, String timeSlot, String desiredTimeSlot, String desiredClinicID);
} // interface DAMCORBAInterfaceOperations
