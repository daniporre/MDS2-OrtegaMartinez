import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-visualizarpedido`
 *
 * VistaVisualizarpedido element.
 *
 * @customElement
 * @polymer
 */
class VistaVisualizarpedido extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-visualizarpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVisualizarpedido.is, VistaVisualizarpedido);
