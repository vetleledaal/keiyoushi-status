# Extension Validation Report

- Extension: tachiyomi-es.zonatmoorgunoriginal-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7391754027638645731
- Source name: ZonaTMO.org (unoriginal)
- Source language: es
- Selected manga input: popular offset 0: La Ventura Del Caballero Blanco (`.../biblioteca <redacted query values: title and type>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | La Ventura Del Caballero Blanco (`.../biblioteca <redacted query values: title and type>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | La Basura De La Familia Del Conde (`.../biblioteca <redacted query values: title and type>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 6 | Toaru Kagaku no Mental Out (`.../biblioteca <redacted query values: title and type>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 5 | Shadow Slave: Manhwa (`.../biblioteca <redacted query values: title and type>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La Ventura Del Caballero Blanco (`.../biblioteca <redacted query values: title and type>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La Ventura Del Caballero Blanco (`.../biblioteca <redacted query values: title and type>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 31 | Capítulo 1 (`.../958732`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La Ventura Del Caballero Blanco, URL=`.../biblioteca <redacted query values: title> ventura del caballero blanco&type=manhwa` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zonatmo.org/.../31352-271f224fe0.webp <redacted query values: r>` (image/webp (encoding: lossy), 44042 bytes, 480x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../biblioteca <redacted query values: title> ventura del caballero blanco&type=manhwa` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://zonatmo.org/.../31352_1778636875.webp <redacted query values: v>` (image/webp (container: extended), 465602 bytes, 2160x2160) |  |  |  |
| details author | PASS | Brothers Without a Tomorrow |  |  |  |
| details artist | PASS | Brothers Without A Tomorrow |  |  |  |
| details genres | PASS | Manhwa, Josei, Drama, Fantasía, Romance, Histórico, +18, Boys Love, Adulto |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Para asegurar la paz entre los reinos del norte y el sur, los gobernantes pactan una alianza estratégica: un matrimonio político entre sus casas reales. Tei, célebre guerrero de Leracal, temido en el campo de batalla y respetado como cazador de monstruos, se ofrece como “novia” para garantizar la tregua. Un sacrificio honorable. Una transición de la guerra al silencio. Pero cuando llega a Arnata, no encuentra frialdad, ni desprecio, ni sospechas. Lo recibe el príncipe heredero Shuraka, joven, sereno, y con una mirada que no juzga, sino que escucha. Lo que parecía un deber pronto se transforma en algo más. Un juramento de protección nace en el pecho de Tei, y lo que comienza como una obligación diplomática, lentamente florece como amor… incluso en medio del peligro. Porque mientras el imperio se agita por dentro, con traiciones familiares y sangre real derramada en nombre del trono, dos hombres que no se eligieron comienzan a elegirse todos los días. En las noches blancas donde no se pone el sol, también brotan sentimientos que no esperaban… pero que ya no pueden ignorar.<br><br>**Títulos alternativos:**<br>- La Flor Que Despierta Bajo La Noche Nívea<br>- Flores de la Noche de Nieve<br>- Blossoms of the White Night<br>- 백야의 꽃길<br>- Le Chemin Fleuri de la Nuit Blanche<br>- Blüten der weißen Nacht |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.zonatmo.org/.../1.webp` (image/webp (container: extended), 469708 bytes, 2160x2160) |  |  |  |
