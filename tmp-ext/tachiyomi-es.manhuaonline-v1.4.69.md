# Extension Validation Report

- Extension: tachiyomi-es.manhuaonline-v1.4.69
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5713083996691468192
- Source name: SamuraiScan
- Source language: es
- Selected manga input: latest offset 0: Emperador Magico (`.../emperador-magico`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | El Heredero del Dragón Ancestral (`.../el-heredero-del-dragon-ancestral`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | El Viajero de los Nueve Cielos Regresa (`.../el-viajero-de-los-nueve-cielos-regresa`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Emperador Magico (`.../emperador-magico`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | El Registro de los Elegidos Celestiales (`.../el-registro-de-los-elegidos-celestiales`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Emperador Magico (`.../emperador-magico`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Emperador Magico (`.../emperador-magico`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 932 | Capitulo 1 (`https://samurai.j5z.xyz/.../capitulo-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 126 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Emperador Magico, URL=`.../emperador-magico` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://samurai.j5z.xyz/.../DM_20230414032553_004-175x238.jpg` (image/jpeg, 13060 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../emperador-magico` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://samurai.j5z.xyz/.../DM_20230414032553_004.jpg` (image/jpeg, 32135 bytes, 300x430) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Aventura, Fantasía, Reencarnación, Tragedia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Zhuo Yifan es un emperador mágico o puede llamarse un emperador demonio, porque tiene un antiguo libro del emperador que se llama el “Libro de los Nueve Secretos”, fue atacado por los siete emperadores e incluso su discípulo lo traicionó. Y para no dejar que obtengan el libro Zhuo Yifan condujo el asesinato de su cuerpo así mismo del libro. Luego, su alma entra y vuelve a la vida en un criado familiar llamado Zhuo Fan. Debido a que una magia demoníaca lo está frenando, debe unir los recuerdos del niño y no puede ignorar a la familia y la amante a la que sirve. ¿Cómo es su vida reconstruyendo a su familia y volviendo a ser el más fuerte del continente…? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 932 chapters |  |  |  |
| chapter dates | PASS | 932 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 932 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 126 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://samurai.j5z.xyz/.../001.png` (image/png, 1164252 bytes, 1343x1076) |  |  |  |
