package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.egov.common.contract.request.RequestInfo;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

/**
 * Contract class to receive request. Array of  items are used in case of create, whereas single  item is used for update
 */
@Schema(description = "Contract class to receive request. Array of  items are used in case of create, whereas single  item is used for update")
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-06-24T14:21:17.170715786+05:30[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BirthRegistrationRequest   {
        @JsonProperty("RequestInfo")

          @Valid
                private RequestInfo requestInfo = null;

        @JsonProperty("BirthRegistrationApplications")
          @Valid
                private List<BirthRegistrationApplication> birthRegistrationApplications = null;


        public BirthRegistrationRequest addBirthRegistrationApplicationsItem(BirthRegistrationApplication birthRegistrationApplicationsItem) {
            if (this.birthRegistrationApplications == null) {
            this.birthRegistrationApplications = new ArrayList<>();
            }
        this.birthRegistrationApplications.add(birthRegistrationApplicationsItem);
        return this;
        }

}
