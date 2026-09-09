# Extension Validation Report

- Extension: tachiyomi-es.lectorasteria-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: moonlighttl
- Source ID: 698506559036250327
- Source name: Lector Asteria
- Source language: es
- Selected manga input: latest offset 0: La bebé hada es una villana (`.../la-bebe-hada-es-una-villana`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 9 | Me convertí en el miembro más joven de un grupo de idols (`.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | La bebé hada es una villana (`.../la-bebe-hada-es-una-villana`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | La bebé hada es una villana (`.../la-bebe-hada-es-una-villana`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | La bebé hada es una villana (`.../la-bebe-hada-es-una-villana`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 72 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La bebé hada es una villana, URL=`.../la-bebe-hada-es-una-villana` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 22/22 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 22/22 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lectorasteria.com/.../db4c9011-ef52-47c3-9630-94045270742e.webp` (image/webp (encoding: lossy), 160562 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../la-bebe-hada-es-una-villana` |  |  |  |
| details thumbnail URL | PASS | `https://media.lectorasteria.com/.../db4c9011-ef52-47c3-9630-94045270742e.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Romance, Fantasia, Drama |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ricessia, la hija de un hada que perdió la razón. Criadora de flores carnívoras, conocida por su carácter implacable y temida por eliminar a sus oponentes con un solo golpe de hacha. Un nombre que causa escalofríos: la hechicera oscura.<br><br>"Wow, esto es una locura."<br><br>Siempre en el centro de los escándalos más impactantes…<br><br>"No puede ser, esto es una completa locura."<br><br>¡Ahora ha renacido como un bebé!<br><br>Marcada por la sangre de un hada caída, Ricessia decide transformarse en una niña y ser adoptada por la familia Basillian, todo con un solo propósito: descubrir la verdad tras los experimentos que arruinaron la vida de su madre.<br><br>"Me llamo Chesia Basillian."<br><br>Su plan era sencillo: reunir información y luego desaparecer. Pero algo empieza a torcerse. Los hombres de la familia Basillian, impecables por fuera pero con un lado oscuro, comienzan a mostrar un interés desmesurado por ella.<br><br>"Fui a tu habitación y no estabas… me asusté muchísimo. Pensé que algo te había pasado."<br><br>Un padre tan encantador como intimidante.<br><br>"¿Por qué no pides quedarte en la familia Basillian?" "Eres distinta… Me tienes fascinado."<br><br>Tres hermanos impredecibles, cuyo afecto por su hermana adoptiva no deja de crecer. Y como si eso no fuera suficiente, el inquisidor del Imperio Sagrado, que ha estado tras la hechicera oscura durante años, ahora la persigue convencido de que su verdadero padre aún sigue vivo.<br><br>"¿Por qué buscas a mi papá…?" "Para encontrar justicia, por supuesto."<br><br>Mientras intenta sobrevivir entre personajes cada vez más inestables, Ricessia descubre que no puede volver a su cuerpo adulto… y que sus enemigos están cada vez más cerca.<br><br>"¿Hasta dónde piensas complicarme la vida, hechicera?"<br><br>¿Podrá Ricessia salir con vida de la familia Basillian? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 72 chapters |  |  |  |
| chapter dates | PASS | 72 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wsrv.nl <redacted query values: url and n>` (image/webp (encoding: lossy), 167226 bytes, 1853x946) |  |  |  |
