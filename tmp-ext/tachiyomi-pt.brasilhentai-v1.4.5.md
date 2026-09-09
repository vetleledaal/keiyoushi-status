# Extension Validation Report

- Extension: tachiyomi-pt.brasilhentai-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
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
- Selected manga input: popular offset 0: A História da Pessoa Que Eu Achava Ser Um Cara na Rede Social (`.../a-historia-da-pessoa-que-eu-achava-ser-um-cara-na-rede-social`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | A História da Pessoa Que Eu Achava Ser Um Cara na Rede Social (`.../a-historia-da-pessoa-que-eu-achava-ser-um-cara-na-rede-social`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 8 | Pousada Feminina 3 (`.../pousada-feminina-3`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 7 | Dando uma Ajudinha para o Sogro (`.../dando-uma-ajudinha-para-o-sogro`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | A História da Pessoa Que Eu Achava Ser Um Cara na Rede Social (`.../a-historia-da-pessoa-que-eu-achava-ser-um-cara-na-rede-social`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../a-historia-da-pessoa-que-eu-achava-ser-um-cara-na-rede-social`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| thumbnail | PASS | `https://brasilhentai.com/.../Pessoa-Achava-CAPA.jpg` (image/jpeg, 50656 bytes, 600x834) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-historia-da-pessoa-que-eu-achava-ser-um-cara-na-rede-social` |  |  |  |
| details thumbnail URL | PASS | `https://brasilhentai.com/.../Pessoa-Achava-CAPA.jpg` |  |  |  |
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
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://brasilhentai.com/.../Pessoa-Achava-01.jpg` (image/jpeg, 163729 bytes, 863x1200) |  |  |  |
