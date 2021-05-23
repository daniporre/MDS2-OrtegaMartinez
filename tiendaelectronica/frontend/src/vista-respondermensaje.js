import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaRespondermensaje extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: flex-start; align-items: flex-end;">
 <vaadin-tab style="height: 15%;"></vaadin-tab>
 <h2 style="align-self: center; width: 45%;">Responder Mensaje</h2>
 <vaadin-text-field label="Mail usuario" id="mailUsuarioTF" style="align-self: center; width: 45%;" readonly></vaadin-text-field>
 <vaadin-text-field label="Asunto" id="asuntoTF" style="align-self: center; width: 45%;" readonly></vaadin-text-field>
 <vaadin-text-area label="Mensaje" id="mensajeTF" style="align-self: center; width: 45%;"></vaadin-text-area>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 45%; justify-content: space-between;">
  <vaadin-button id="aceptarButton">
   Aceptar
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button theme="primary" id="responderMensajeButton">
   Responder mensaje
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-respondermensaje';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRespondermensaje.is, VistaRespondermensaje);
