/**
 * 
 */
package com.musicacademy.osgi.eventpublisher;

/**
 * @author sashi
 *
 */
public interface IEventPublisher {
	public void chooseAnOption(String consumer);
	public void addNewEvent();
	public void displayAllEvents();
	public void cancelEvent();
	public void filterByEventCategory();

}
