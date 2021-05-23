import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaMensajesenviados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); align-self: stretch; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout">
  <label id="estadoLabel" style="width: 10%;">Estado</label>
  <label id="cuerpoMensajeLabel" style="flex-grow: 1; width: 50%;">Cuerpo del mensaje</label>
  <label id="asuntoMensajeLabel" style="flex-grow: 1; width: 15%;">Asunto</label>
  <label id="fechaMensajeLabel" style="width: 15%;">Fecha</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mensajesenviados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensajesenviados.is, VistaMensajesenviados);
