package me.giovannipicco.ezer.utilty.configuration.message;

public class MessageConfiguration {
	
	private MessageConfiguration() {
	}

	public static final MessageKey ERROR_MESSAGE_GENERIC = new MessageKey(
				"error.message.generic",
				"Ops, qualcosa è andato storto. Riprova più tardi."
			);

	public static final MessageKey ERROR_MESSAGE_CUSTOMER_NOT_FOUND = new MessageKey(
			"error.message.customer.notfound",
			"Ops, il cliente non è stato trovato. Controlla i dati inseriti"
		);
}
