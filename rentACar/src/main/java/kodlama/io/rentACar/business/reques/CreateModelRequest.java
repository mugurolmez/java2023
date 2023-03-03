package kodlama.io.rentACar.business.reques;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
	@NotNull
	@NotBlank
	@Size(min=3, max=20)//karakter  boyutu
	private String name;

	@NotNull
	@NotBlank
	@Size
	private int brandId;
	
	
}
