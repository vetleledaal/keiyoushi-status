# Extension Validation Report

- Extension: tachiyomi-es.leercapitulo-v1.4.17
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5621901596522308538
- Source name: LeerCapitulo
- Source language: es
- Selected manga input: popular offset 0: Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 90 | Antes una asesina, ahora niñera real (`.../antes-una-asesina-ahora-ninera-real`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 355 | Capitulo 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Unable to find the script | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Unable to find the script | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 90 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Subiendo De Nivel 10.000 Años En el Futuro., URL=`.../subiendo-de-nivel-10-000-anos-en-el-futuro` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 115/115 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 115/115 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.leercapitulo.co/.../31265b4e9277b26ac8c0fe7296c1d3.jpg <redacted query values: v1762641074242>` (image/jpeg, 66971 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../subiendo-de-nivel-10-000-anos-en-el-futuro` |  |  |  |
| details thumbnail URL | PASS | `https://www.leercapitulo.co/.../31265b4e9277b26ac8c0fe7296c1d3.jpg <redacted query values: v1762641074242>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Artes Marciales, Vida Escolar |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Al principio del dao marcial, terroríficas bestias invadieron el mundo y los artistas marciales humanos fueron derrotados. Lu Sheng viaja en el tiempo y entra en el mundo 10.000 años en el futuro en su sueño... Diez mil años después, las técnicas básicas de refinamiento corporal han sido renovadas para ser miles de veces más efectivas de lo que son ahora. Técnicas de respiración, remedios para refinar el cuerpo y textos sagrados sobre artes marciales. Diez mil años después del Dao Marcial, la humanidad se ha extinguido. La civilización marcial que había florecido hasta su apogeo no tenía a nadie que la heredara y ¡Lu Sheng, es la única esperanza!<br><br>Alt name(s): 高武：登陆未来一万年, Level Up In The Future, Iniciando sesión en 10,000 años en el futuro |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 355 chapters |  |  |  |
| chapter dates | LINT | All 355 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=355 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Unable to find the script |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
