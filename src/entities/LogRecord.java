package entities;

import java.time.Instant;
import java.util.Objects;

public class LogRecord{
	private String name;
	private Instant access;
	
	public LogRecord(String name, Instant access) {
		this.name = name;
		this.access = access;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getAccess() {
		return access;
	}

	public void setAccess(Instant access) {
		this.access = access;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogRecord other = (LogRecord) obj;
		return Objects.equals(name, other.name);
	}

	
	
	
	
}
