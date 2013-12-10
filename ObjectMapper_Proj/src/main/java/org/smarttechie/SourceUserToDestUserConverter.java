package org.smarttechie;

import org.modelmapper.ModelMapper;
import org.smarttechie.dest.DestUser;
import org.smarttechie.source.Address;
import org.smarttechie.source.SourceUser;

public class SourceUserToDestUserConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create Source User Object
		SourceUser sourceUser = new SourceUser();
		sourceUser.setUserId("10000");
		sourceUser.setUserName("John");
		sourceUser.setFirstName("Clarke");
		sourceUser.setLastName("Michael");
		sourceUser.setBio("simple is best");
		sourceUser.setAvatarURL("https://pbs.twimg.com/profile_images/378800000408827721/b603196c7106ced095e7f891b42f4c86_bigger.jpeg");
		Address address = new Address();
		address.setCity("TUCSON");
		address.setStreet("75 E DRAGRAM");
		address.setZipCode("85705");
		address.setState("NJ");
		address.setCountry("USA");
		sourceUser.setAddress(address);
		//Model Mapper code to map the data from source user to destination user
		ModelMapper modelMapper = new ModelMapper();
		DestUser destUser = modelMapper.map(sourceUser, DestUser.class);
		//Verify the destination user data
		System.out.println(destUser.getFirstName());
		System.out.println(destUser.getLastName());
		System.out.println(destUser.getBio());
	}

}
