import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaVermensajerecibido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; justify-content: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center; flex-shrink: 1; flex-direction: column;">
  <label style="align-self: flex-start;">Responder mensaje</label>
  <vaadin-text-field label="Asunto" style="align-self: stretch;"></vaadin-text-field>
  <vaadin-text-area label="Mensaje" placeholder="Escribe tu mensaje aquí" style="align-self: stretch;"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-button>
    Aceptar
   </vaadin-button>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <vaadin-button>
    Enviar mensaje
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 25%;"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
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
