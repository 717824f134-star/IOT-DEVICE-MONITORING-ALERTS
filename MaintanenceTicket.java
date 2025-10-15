package com.iotmonitoring.model; public
class MaintenanceTicket {
 private int id; private String status; // OPEN, CLOSED
private String resolutionNotes; private Alert alert; public
MaintenanceTicket(int id, String status, Alert alert) {
 this.id = id;
this.status = status;
this.alert = alert;
 }
 public int getId() {
return id;
 }
 public String getStatus() {
return status;
 }
 public void setStatus(String s) {
this.status = s;
 }
 public String getResolutionNotes() {
return resolutionNotes;
 }
 public void setResolutionNotes(String resolutionNotes) {
this.resolutionNotes = resolutionNotes;
 }
 @Override public String
toString() { return
"Ticket[id=" + id +
 ", status=" + status +
 ", alertId=" + (alert != null ? alert.getId() : "N/A") + "]";
 }
}
