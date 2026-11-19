# Extension Validation Report

- Extension: tachiyomi-pt.mugiwarasoficial-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: aurora
- Source ID: 5560103996308474844
- Source name: Mugiwaras Oficial
- Source language: pt-BR
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 697 | One Piece (`.../one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | Sonna, 14-sai. (`.../sonna-14-sai`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | One Piece (`.../one-piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1199 | Capítulo 1 (`.../chp_1776210900184`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 697 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 809/809 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 809/809 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aurora.snipercache.com/.../1785954191353-one-piece.webp` (image/webp (encoding: lossy), 297920 bytes, 900x1409) |  |  |  |
| details identity | PASS | Details preserved selected URL `one-piece` |  |  |  |
| details thumbnail URL | PASS | `https://aurora.snipercache.com/.../1785954191353-one-piece.webp` |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Comédia, Fantasia, Drama, Premiado, Sci-Fi |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Quando criança, Monkey D. Luffy foi inspirado a se tornar um pirata ao ouvir as histórias do bucaneiro “Ruivo” Shanks. Mas sua vida mudou quando Luffy acidentalmente comeu a Fruta do Diabo Gomu Gomu e ganhou o poder de esticar o corpo como borracha... ao custo de nunca mais poder nadar! Anos depois, ainda determinado a se tornar o Rei dos Piratas, Luffy parte em sua jornada — sozinho em um pequeno barco, em busca do lendário “One Piece”, dito ser o maior tesouro do mundo. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1199 chapters |  |  |  |
| chapter dates | PASS | 1199 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://mugiwarasoficial.org/.../callback <redacted query values: token>` to `https://mugiwarasoficial.org/.../1` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
