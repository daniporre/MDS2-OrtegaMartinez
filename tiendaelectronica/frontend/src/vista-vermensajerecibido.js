import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaVermensajerecibido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;">
 <label style="align-self: center;">Responder mensaje</label>
 <vaadin-text-field label="Asunto" style="align-self: center;"></vaadin-text-field>
 <vaadin-text-area label="Mensaje" placeholder="Escribe tu mensaje aquí" style="align-self: center;"></vaadin-text-area>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-button>
   Aceptar
  </vaadin-button>
  <vaadin-button>
   Enviar mensaje
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-vermensajerecibido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVermensajerecibido.is, VistaVermensajerecibido);
