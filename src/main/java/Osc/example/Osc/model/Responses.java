package Osc.example.Osc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Responses
{
        private String status;
        private String responseMessage;
        private List<?> data;
        private Object postData;
        private String check;

}
