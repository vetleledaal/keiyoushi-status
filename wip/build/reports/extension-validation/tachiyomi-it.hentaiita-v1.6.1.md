# Extension Validation Report

- Extension: tachiyomi-it.hentaiita-v1.6.1
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
- Source ID: 5279259667822182743
- Source name: Hentai ITA
- Source language: it
- Selected manga input: latest offset 0: Quella mamma è mia 1 (`.../quella-mamma-e-mia-1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Troppo in forma 1 (`.../troppo-in-forma-1-2`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Hansel e Gretel (`.../hansel-e-gretel`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 24 | Quella mamma è mia 1 (`.../quella-mamma-e-mia-1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Una grande infermiera 1 (`.../una-grande-infermiera-1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Quella mamma è mia 1 (`.../quella-mamma-e-mia-1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Quella mamma è mia 1 (`.../quella-mamma-e-mia-1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capitolo unico (`.../quella-mamma-e-mia-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Quella mamma è mia 1, URL=`.../quella-mamma-e-mia-1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai-ita.net/.../preview_05-46-768x1087.jpg` (image/jpeg, 166288 bytes, 768x1087) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../quella-mamma-e-mia-1` |  |  |  |
| details thumbnail URL | PASS | `https://hentai-ita.net/.../preview_05-46-768x1087.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | hentai manga, Incest, Mother hentai, tette enormi, fumetti porno |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentai-ita.net/.../quella-mamma-e-mia-1` to `https://hentai-ita.net/.../quella-mamma-e-mia-1` (1 redirects) |  |  |  |
| page load | PASS | `https://hentai-ita.net/.../chapter1_image_001-62.jpg` (image/jpeg, 468768 bytes, 1276x1806) |  |  |  |
