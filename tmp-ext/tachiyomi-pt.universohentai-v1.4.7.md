# Extension Validation Report

- Extension: tachiyomi-pt.universohentai-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gattsu
- Source ID: 4207492914234184899
- Source name: Universo Hentai
- Source language: pt-BR
- Selected manga input: latest offset 0: Basaki no Kachigina SenpaiShufu (36) wa Gobousata de… (`.../basaki-no-kachigina-senpaishufu-36-wa-gobousata-de`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | Basaki no Kachigina SenpaiShufu (36) wa Gobousata de… (`.../basaki-no-kachigina-senpaishufu-36-wa-gobousata-de`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 17 | Kko to Yamioji Shoku (`.../kko-to-yamioji-shoku`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 17 | Basaki no Kachigina SenpaiShufu (36) wa Gobousata de… (`.../basaki-no-kachigina-senpaishufu-36-wa-gobousata-de`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 17 | Kko to Yamioji Shoku (`.../kko-to-yamioji-shoku`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Basaki no Kachigina SenpaiShufu (36) wa Gobousata de… (`.../basaki-no-kachigina-senpaishufu-36-wa-gobousata-de`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../galeria <redacted query values: id>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 68/68 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 68/68 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://universohentai.com/.../002-6-371x518.jpg` (image/jpeg, 154829 bytes, 371x518) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../basaki-no-kachigina-senpaishufu-36-wa-gobousata-de` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://universohentai.com/.../002-6.jpg` (image/jpeg, 306531 bytes, 1280x1627) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Creampie, Masturbação, Peitões, Pelos Pubianos, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://universohentai.com/.../001-6.jpg` (image/jpeg, 106455 bytes, 560x420) |  |  |  |
