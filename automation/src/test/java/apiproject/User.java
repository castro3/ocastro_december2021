package apiproject;

public class User<T> {

	private T id;
	private T email;
	private T first_name;
	private T last_name;
	private T avatar;
	
	public User(T id, T email, T first_name, T last_name, T avatar) {
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.avatar = avatar;
	}

	public T getId() {
		return id;
	}

	public T getEmail() {
		return email;
	}

	public T getFirst_name() {
		return first_name;
	}

	public T getLast_name() {
		return last_name;
	}

	public T getAvatar() {
		return avatar;
	}
	
	
}
