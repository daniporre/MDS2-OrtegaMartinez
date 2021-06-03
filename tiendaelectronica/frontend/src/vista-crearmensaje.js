import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCrearmensaje extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout class="content" style="justify-content: flex-start; align-items: flex-end; height: 100%; width: 100%;">
 <vaadin-tab style="height: 15%;"></vaadin-tab>
 <h2 style="align-self: center; width: 45%;">Crear mensaje</h2>
 <vaadin-text-field label="Asunto" id="asuntoTF" style="align-self: center; width: 45%;"></vaadin-text-field>
 <vaadin-text-area label="Mensaje" placeholder="Escribe un mensaje al administrador de la web" id="mensajeTF" style="align-self: center; flex-grow: 0; width: 45%;"></vaadin-text-area>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 45%;">
  <vaadin-button id="cancelarButton">
    Cancelar 
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button theme="primary" id="enviarMensajeButton">
    Enviar mensaje 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-crearmensaje';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCrearmensaje.is, VistaCrearmensaje);
