# Extension Validation Report

- Extension: tachiyomi-fr.mangahubfr-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3294884430139323314
- Source name: MangaHub.fr
- Source language: fr
- Selected manga input: popular offset 0: BJ Alex (`.../15483`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | BJ Alex (`.../15483`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Love Jinx (`.../26088`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | I’m the Max-Level Newbie (`.../65998`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Under the Memory (`.../64235`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | BJ Alex (`.../15483`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | BJ Alex (`.../15483`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Chapitre 1 (`.../chapitre-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=BJ Alex, URL=`15483` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangahub.fr/.../cover_250x350-15483-350x476.jpg` (image/jpeg, 32340 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `15483` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangahub.fr/.../cover_250x350-15483-193x278.jpg` (image/jpeg, 14586 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | Manga, Romance, Yaoi, Premium |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tous les soirs à 22h, Dong-gyun s’enferme dans sa chambre, attrape une boîte de mouchoirs et regarde le live d’Alex, un BJ (broadcast jockey). Le timide Dong-gyun admire non seulement le corps balafré d’Alex, mais aussi sa sincérité à partager ses expériences sexuelles avec les visionneurs. Un soir, Dong-gyun boit trop lors d’un évènement avec ses camarades d’école et il s’évanouit. Quant il se réveille, un beau mec est devant lui. Un beau mec qui ressemble énormément à… Alex.<br><br>Alternative Names: BJ 알렉스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangahub.fr/.../admin-ajax.php <redacted query values: action and token>` (image/jpeg, 199011 bytes, 720x2813) |  |  |  |
