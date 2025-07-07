package entity;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@AttributeOverrides({
    @AttributeOverride(
            name = "RAM",
            column = @Column(name = "ram")
    ),
    @AttributeOverride(
            name = "SCREEN",
            column = @Column(name = "screen")
    ),
    @AttributeOverride(
            name = "CHARGEPORT",
            column = @Column(name = "chargeport")
    ),
    @AttributeOverride(
			name = "AUX",
			column = @Column(name = "aux")
	),
	@AttributeOverride(
			name = "BLUETOOTH",
			column = @Column(name = "bluetooth")
	),
	@AttributeOverride(
			name = "PROCESSOR",
			column = @Column(name = "processor")
	),
	@AttributeOverride(
			name = "SPEAKER",
			column = @Column(name = "speaker")
	),
	@AttributeOverride(
			name = "CALLSPEAKER",
			column = @Column(name = "callspeaker")
	)
})
public class Advanceinfo {
	private String RAM;
	private String SCREEN;
	private String CHARGEPORT;
	private String AUX;
	private String BLUETOOTH;
	private String PROCESSOR;
	private String SPEAKER;
	private String CALLSPEAKER;
}
