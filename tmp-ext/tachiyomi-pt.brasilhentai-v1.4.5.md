# Extension Validation Report

- Extension: tachiyomi-pt.brasilhentai-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8020430975962445741
- Source name: Brasil Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Minha Vida Sexual em Tóquio ~A Senhoria E Sua Filha 1 (`.../minha-vida-sexual-em-toquio-a-senhoria-e-sua-filha-1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Minha Vida Sexual em Tóquio ~A Senhoria E Sua Filha 1 (`.../minha-vida-sexual-em-toquio-a-senhoria-e-sua-filha-1`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 8 | Eu, Um Universitário, Acabei Gozando Sem Camisinha (`.../eu-um-universitario-acabei-gozando-sem-camisinha`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 7 | Dando uma Ajudinha para o Sogro (`.../dando-uma-ajudinha-para-o-sogro`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Minha Vida Sexual em Tóquio ~A Senhoria E Sua Filha 1 (`.../minha-vida-sexual-em-toquio-a-senhoria-e-sua-filha-1`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../minha-vida-sexual-em-toquio-a-senhoria-e-sua-filha-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 67 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 7 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://brasilhentai.com/.../Minha-Vida-Sexual-CAPA.jpg` (image/jpeg, 32375 bytes, 600x848) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../minha-vida-sexual-em-toquio-a-senhoria-e-sua-filha-1` |  |  |  |
| details thumbnail URL | PASS | `https://brasilhentai.com/.../Minha-Vida-Sexual-CAPA.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://brasilhentai.com/.../Minha-Vida-Sexual-01.jpg` (image/jpeg, 100201 bytes, 849x1200) |  |  |  |
