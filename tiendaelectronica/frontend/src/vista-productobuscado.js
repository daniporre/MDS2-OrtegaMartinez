import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productobuscado`
 *
 * VistaProductobuscado element.
 *
 * @customElement
 * @polymer
 */
class VistaProductobuscado extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
        `;
    }

    static get is() {
        return 'vista-productobuscado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductobuscado.is, VistaProductobuscado);
