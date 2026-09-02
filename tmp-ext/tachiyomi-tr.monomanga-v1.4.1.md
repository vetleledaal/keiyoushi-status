# Extension Validation Report

- Extension: tachiyomi-tr.monomanga-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7385940383162035314
- Source name: Mono Manga
- Source language: tr
- Selected manga input: popular offset 0: Ichizu de Bitch na Kouhai (`.../ichizu-de-bitch-na-kouhai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | Ichizu de Bitch na Kouhai (`.../ichizu-de-bitch-na-kouhai`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Kuzu no Honkai (`.../kuzu-no-honkai`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Ballroom e Youkoso (`.../ballroom-e-youkoso`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ichizu de Bitch na Kouhai (`.../ichizu-de-bitch-na-kouhai`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ichizu de Bitch na Kouhai (`.../ichizu-de-bitch-na-kouhai`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 136 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ichizu de Bitch na Kouhai, URL=`.../ichizu-de-bitch-na-kouhai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.monomanga.com.tr/.../1753504972324_0.jpeg <redacted query values: w>` (image/webp (container: extended), 21008 bytes, 300x426) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ichizu-de-bitch-na-kouhai` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.monomanga.com.tr/.../1753504972324_0.jpeg` (image/webp (container: extended), 21008 bytes, 300x426) |  |  |  |
| details author | PASS | IRONON |  |  |  |
| details artist | PASS | IRONON |  |  |  |
| details genres | PASS | Dram, Komedi, Okul Hayatı, Romantizm, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Senpai’si ile uğraşmayı seven yaramaz bir Kouhai’nin hikayesi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 136 chapters |  |  |  |
| chapter dates | PASS | 136 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.monomanga.com.tr/.../001.webp` (image/webp (container: extended), 292572 bytes, 1133x1600) |  |  |  |
