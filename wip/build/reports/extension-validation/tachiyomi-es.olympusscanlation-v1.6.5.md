# Extension Validation Report

- Extension: tachiyomi-es.olympusscanlation-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1596411039134168890
- Source name: Olympus Scanlation
- Source language: es
- Selected manga input: popular offset 0: La venganza del sabueso de sangre de hierro (`.../743`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | La venganza del sabueso de sangre de hierro (`.../743`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 15 | El extra de la novela (remake) (`.../74`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | La secta más fuerte de todos los tiempos (`.../536`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Llevo Mil Años Atrapado En El Mismo Día (`.../1351`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La venganza del sabueso de sangre de hierro (`.../743`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La venganza del sabueso de sangre de hierro (`.../743`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 193 | Capitulo 1 (`.../58809`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La venganza del sabueso de sangre de hierro, URL=`743` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.imagesolymp.xyz/.../sabueso-venganza-lg.webp` (image/webp (container: extended), 25846 bytes, 230x398) |  |  |  |
| details identity | PASS | Details preserved selected URL `743` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.imagesolymp.xyz/.../sabueso-venganza-xl.webp` (image/webp (container: extended), 34094 bytes, 280x484) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Reencarnación, Shonen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br>\[Por el estudio que te trajo <Solo Leveling>, <Asesino de la Luna a la deriva>, ¡y muchos más!\]<br><br>Era el sabueso de la familia Baskerville: Vikir.<br><br>Sin embargo, su lealtad fue recompensada con la cuchilla de una guillotina ensuciada por la calumnia.<br><br>"Nunca viviré la vida de un sabueso sacrificado después de cazar al conejo".<br><br>En lugar de la muerte, le espera una oportunidad inesperada.<br><br>Los ojos de Vikir brillaron en rojo mientras afilaba sus caninos en la oscuridad.<br><br>"Sólo espera, Hugo. Esta vez te arrancaré la garganta".<br><br>Es hora de que el sabueso se vengue sangrientamente de su dueño. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 193 chapters |  |  |  |
| chapter dates | PASS | 193 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://olympusbiblioteca.com` to `https://olympusxyz.com` (1 redirects); popular: `https://olympusbiblioteca.com/.../list` to `https://olympusxyz.com/.../list` (1 redirects); popular: `https://olympusbiblioteca.com/.../rankings <redacted query values: page and period>` to `https://olympusxyz.com/.../rankings <redacted query values: page and period>` (1 redirects); popular: `https://olympusbiblioteca.com/.../new-chapters <redacted query values: page>` to `https://olympusxyz.com/.../new-chapters <redacted query values: page>` (1 redirects); popular: `https://olympusbiblioteca.com/.../20-225-2sabueso13424 <redacted query values: type>` to `https://olympusxyz.com/.../20-225-2sabueso13424 <redacted query values: type>` (1 redirects); popular: `https://olympusbiblioteca.com/.../rankings <redacted query values: page and period>` to `https://olympusxyz.com/.../rankings <redacted query values: page and period>` (1 redirects); popular: `https://olympusbiblioteca.com/.../chapters <redacted query values: page, direction, and type>` to `https://olympusxyz.com/.../chapters <redacted query values: page, direction, and type>` (1 redirects); popular: `https://olympusbiblioteca.com/.../new-chapters <redacted query values: page>` to `https://olympusxyz.com/.../new-chapters <redacted query values: page>` (1 redirects); popular: `https://olympusbiblioteca.com/.../chapters <redacted query values: page, direction, and type>` to `https://olympusxyz.com/.../chapters <redacted query values: page, direction, and type>` (1 redirects); popular: `https://olympusbiblioteca.com/.../chapters <redacted query values: page, direction, and type>` to `https://olympusxyz.com/.../chapters <redacted query values: page, direction, and type>` (1 redirects); popular: `https://olympusbiblioteca.com/.../chapters <redacted query values: page, direction, and type>` to `https://olympusxyz.com/.../chapters <redacted query values: page, direction, and type>` (1 redirects); popular: `https://olympusbiblioteca.com/.../chapters <redacted query values: page, direction, and type>` to `https://olympusxyz.com/.../chapters <redacted query values: page, direction, and type>` (1 redirects); popular: `https://olympusbiblioteca.com/.../comic-20-225-2sabueso13424` to `https://olympusxyz.com/.../1` (2 redirects) |  |  |  |
| page load | PASS | `https://media.imagesolymp.xyz/.../0.webp` (image/webp (encoding: lossy), 301110 bytes, 1920x1286) |  |  |  |
