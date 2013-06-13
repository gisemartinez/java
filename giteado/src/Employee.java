
public class Employee extends Customer{
	private long file;
	public long getFile(){
		return file;
	};
	public void setFile(long file){
		this.file=file;
	};
	public String toString(){
		return "[Empleado] " + super.toString();
	}
}
