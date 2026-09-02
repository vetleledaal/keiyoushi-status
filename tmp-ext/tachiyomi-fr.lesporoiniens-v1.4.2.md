# Extension Validation Report

- Extension: tachiyomi-fr.lesporoiniens-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7783284177278678538
- Source name: Les Poroiniens
- Source language: fr
- Selected manga input: popular offset 0: Jour Après Jour (`.../jour-apres-jour`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 321 | Jour Après Jour (`.../jour-apres-jour`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Jour Après Jour (`.../jour-apres-jour`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Jour Après Jour (`.../jour-apres-jour`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 65 | Vol. 1 Ch. 1 – Tape-fesse (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 321 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jour Après Jour, URL=`.../jour-apres-jour` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 322/322 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 322/322 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.lesporoiniens.org/.../cover%203%20LQ.webp` (image/webp (container: extended), 96598 bytes, 1445x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jour-apres-jour` |  |  |  |
| details thumbnail URL | PASS | `https://img.lesporoiniens.org/.../cover%203%20LQ.webp` |  |  |  |
| details author | PASS | Yamamoto Souichirou |  |  |  |
| details artist | PASS | Yamamoto Souichirou |  |  |  |
| details genres | PASS | Comédie, École, Tranche de vie, Sport |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dans un certain lycée se trouve un certain club et ses trois managers. Bien qu'anodins, des jours comme on n'en trouve nulle part ailleurs voient le jour ! Dessiné par Yamamoto Souichiro : une toute nouvelle histoire de jeunesse sur le thème du sport !<br><br>Alternative Titles:<br>• マネマネにちにち<br>• Mane Mane Nichi Nichi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 65 chapters |  |  |  |
| chapter dates | LINT | 26 of 65 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=26 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.imgchest.com/.../45xcv2navb7.png` (image/png, 5805995 bytes, 2755x4096) |  |  |  |
