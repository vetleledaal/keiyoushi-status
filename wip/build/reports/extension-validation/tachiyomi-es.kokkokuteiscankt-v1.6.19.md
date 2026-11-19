# Extension Validation Report

- Extension: tachiyomi-es.kokkokuteiscankt-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 2159936368130445305
- Source name: Kokkokutei Scan KT
- Source language: es
- Selected manga input: popular offset 0: Keiyaku Shimai (`.../keiyaku-shimai.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Keiyaku Shimai (`.../keiyaku-shimai.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Memories (`.../memories.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Keiyaku Shimai (`.../keiyaku-shimai.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Keiyaku Shimai (`.../keiyaku-shimai.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Episodio 13 (`.../episode-13.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Keiyaku Shimai, URL=`.../keiyaku-shimai.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../1ca70ea1-8118-440a-bb59-98e7729bdf0b.jpg` (image/jpeg, 129549 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../keiyaku-shimai.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../1ca70ea1-8118-440a-bb59-98e7729bdf0b.jpg` (image/jpeg, 59703 bytes, 340x484) |  |  |  |
| details author | PASS | Hijiki |  |  |  |
| details artist | PASS | Hijiki |  |  |  |
| details genres | PASS | Manga, Comedy, Romance, Shoujo, Yuri |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La alegría secreta de la vida de Kasane Hayafuji es ver a Aoyama-san, una camarera de un restaurante familiar. Una noche, vio a Aoyama de pie, sola, bajo la lluvia. Cuando trató de ayudar, Aoyama le hizo una oferta repentina. "¿Quieres ser mi hermana mayor?" |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.png` (image/png, 1394237 bytes, 1115x1600) |  |  |  |
