# Extension Validation Report

- Extension: tachiyomi-pt.fleurblanche-v1.6.59
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: madara
- Source ID: 2748000026130339026
- Source name: Fleur Blanche
- Source language: pt-BR
- Selected manga input: latest offset 0: Jumping The Geon (`.../10634`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (`.../60`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Love in Orbit (`.../760`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 25 | Jumping The Geon (`.../10634`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Jackpot! (`.../2660`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jumping The Geon (`.../10634`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jumping The Geon (`.../10634`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 45 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jumping The Geon, URL=`10634` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fbsquadx.com/.../capa1-1-175x238.jpg` (image/jpeg, 12689 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `10634` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://fbsquadx.com/.../Banner2.webp` (image/webp (encoding: lossy), 131912 bytes, 1080x540) |  |  |  |
| details author | PASS | POONG5 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Amor e Ódio, BL, Primeiro amor, Ativo, Fleur Blanche Scan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fbsquadx.com/.../0.1-MORGANA.webp` (image/webp (encoding: lossy), 81494 bytes, 890x1280) |  |  |  |
