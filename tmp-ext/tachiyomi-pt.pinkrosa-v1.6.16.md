# Extension Validation Report

- Extension: tachiyomi-pt.pinkrosa-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 8456404960509331854
- Source name: Pink Rosa
- Source language: pt-BR
- Selected manga input: popular offset 0: Gal ni Yasashii Otaku-kun (`.../gal-ni-yasashii-otaku-kun.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Gal ni Yasashii Otaku-kun (`.../gal-ni-yasashii-otaku-kun.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Kanchigai no Atelier Meister (`.../kanchigai-no-atelier-meister_5.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gal ni Yasashii Otaku-kun (`.../gal-ni-yasashii-otaku-kun.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gal ni Yasashii Otaku-kun (`.../gal-ni-yasashii-otaku-kun.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | Chapter 01 (`.../cap-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gal ni Yasashii Otaku-kun, URL=`.../gal-ni-yasashii-otaku-kun.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 132685 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gal-ni-yasashii-otaku-kun.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 319045 bytes, 1125x1600) |  |  |  |
| details author | PASS | Souchuu, 138 Neko |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comédia, Romance, Slice of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Otakura é um garoto do ensino médio que é claramente um otaku — Narumi é uma garota do ensino médio que é uma gal. Normalmente ambos seriam polos opostos que nunca conversariam na escola, mas por alguma coincidência, Narumi pede algo para Otakura que o faz usar toda sua sabedoria para ajudar Narumi. Com isso, Narumi faz pedidos um atrás do outro para Otakura. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00.png` (image/png, 623050 bytes, 800x600) |  |  |  |
