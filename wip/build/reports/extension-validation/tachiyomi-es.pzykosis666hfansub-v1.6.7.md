# Extension Validation Report

- Extension: tachiyomi-es.pzykosis666hfansub-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: foolslide
- Source ID: 6241339222563280170
- Source name: Pzykosis666HFansub
- Source language: es
- Selected manga input: popular offset 0: El Secreto de la Hermosa Editora en Jefe (`.../el_secreto_de_la_hermosa_editora_en_jefe`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | El Secreto de la Hermosa Editora en Jefe (`.../el_secreto_de_la_hermosa_editora_en_jefe`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | El Cumpleaños de la Hechicera (`.../el_cumpleaos_de_la_hechicera`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 18 | ¿No es una fantasia que la eromangaka sea una pervertida? (`.../no-es-una-fantasia-que-la-eromangaka-sea-una-pervertida`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 20 | Caminando Totalmente Desnuda (`.../caminando_totalmente_desnuda`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Secreto de la Hermosa Editora en Jefe (`.../el_secreto_de_la_hermosa_editora_en_jefe`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Secreto de la Hermosa Editora en Jefe (`.../el_secreto_de_la_hermosa_editora_en_jefe`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | Capítulo 1: El Día Libre Secreto de la Hermosa Editora en Jefe (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 10s+ |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Secreto de la Hermosa Editora en Jefe, URL=`.../el_secreto_de_la_hermosa_editora_en_jefe` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Monster Musume no Iru Nichijou, URL=`.../monster_musume_no_iru_nichijou` at page 1 offsets 11, 13, 17 and page 2 offsets 2, 5, 7, 9, 14, 17, title=El Secreto de la Hermosa Editora en Jefe, URL=`.../el_secreto_de_la_hermosa_editora_en_jefe` at page 1 offset 15 and page 2 offsets 1, 4, 6, 8, 10, 12, 15 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 3 manga entries; Latest page 2 repeats 14 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 50/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lector.pzykosis666hfansub.com/.../000a.jpg` (image/jpeg, 3941990 bytes, 4661x1969) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el_secreto_de_la_hermosa_editora_en_jefe` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lector.pzykosis666hfansub.com/.../thumb_000a.jpg` (image/jpeg, 14261 bytes, 250x106) |  |  |  |
| details author | PASS | Yamazaki Masato |  |  |  |
| details artist | PASS | Tatsunami Youtoku |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lector.pzykosis666hfansub.com/.../000a.jpg` (image/jpeg, 3941990 bytes, 4661x1969) |  |  |  |
