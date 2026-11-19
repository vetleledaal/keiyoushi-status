# Extension Validation Report

- Extension: tachiyomi-fr.lesporoiniens-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 1
- Warnings: 0
- Skipped: 11
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7783284177278678538
- Source name: Les Poroiniens
- Source language: fr
- Selected manga input: popular offset 0: Jour Après Jour (`.../jour-apres-jour`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 328 | Jour Après Jour (`.../jour-apres-jour`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jour Après Jour (`.../jour-apres-jour`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jour Après Jour (`.../jour-apres-jour`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 69 | Vol. 1 Ch. 1 – Tape-fesse (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | PASS | 328 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jour Après Jour, URL=`.../jour-apres-jour` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 329/329 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 329/329 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.lesporoiniens.org/.../cover%204%20LQ.webp` (image/webp (container: extended), 37096 bytes, 1445x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jour-apres-jour` |  |  |  |
| details thumbnail URL | PASS | `https://img.lesporoiniens.org/.../cover%204%20LQ.webp` |  |  |  |
| details author | PASS | Yamamoto Souichirou |  |  |  |
| details artist | PASS | Yamamoto Souichirou |  |  |  |
| details genres | PASS | Comédie, École, Tranche de vie, Sport |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dans un certain lycée se trouve un certain club et ses trois managers. Bien qu'anodins, des jours comme on n'en trouve nulle part ailleurs voient le jour ! Dessiné par Yamamoto Souichiro : une toute nouvelle histoire de jeunesse sur le thème du sport !<br><br>Alternative Titles:<br>• マネマネにちにち<br>• Mane Mane Nichi Nichi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | LINT | 30 of 69 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=30 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 500 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
