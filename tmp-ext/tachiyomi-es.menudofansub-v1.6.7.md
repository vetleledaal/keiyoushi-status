# Extension Validation Report

- Extension: tachiyomi-es.menudofansub-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3505996597464989970
- Source name: Menudo-Fansub
- Source language: es
- Selected manga input: popular offset 0: A channel (`.../a_channel`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A channel (`.../a_channel`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Gokusen (`.../gokusen`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 13 | Toradora! (`.../toradora`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 9 | OneShots (`.../oneshots`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A channel (`.../a_channel`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A channel (`.../a_channel`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Prólogo (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A channel, URL=`.../a_channel` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=OneShots, URL=`.../oneshots` at page 1 offsets 1, 4, 7, 12 and page 2 offsets 0, 5, 8, title=Deus ex Machina, URL=`.../deus_ex_machina` at page 1 offsets 2, 8 and page 2 offset 1, title=Gokusen, URL=`.../gokusen` at page 1 offsets 3, 9 and page 2 offset 3, title=Minami-ke, URL=`.../minamike` at page 1 offset 10 and page 2 offset 2, title=Lucky Star, URL=`.../lucky_star` at page 1 offset 11 and page 2 offset 6 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 6 manga entries; Latest page 2 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 50/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.menudo-fansub.com/.../A_channel_v01.jpg` (image/jpeg, 288347 bytes, 975x1400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a_channel` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.menudo-fansub.com/.../thumb_A_channel_v01.jpg` (image/jpeg, 13871 bytes, 175x250) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tooru, la mejor amiga de la infancia de Run, consigue entrar al mismo instituto que su amiga. Cuando va a contárselo, se encuentra con una situación un tanto violenta entre su vieja amiga y dos nuevas amigas de Run: Yuuko y Nagi. Disfruta con la divertida historia de estas cuatro amigas: la sobreprotección de Tooru, sus chascarrillos con Yuuko (por el malentendido cuando se conocieron) y las idas de olla de Run y Nagi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../menudofansub` at offsets 1, 2 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.menudo-fansub.com/.../A%20Channel%20v01%20c000%20000%20-%20Staff.jpg` (image/jpeg, 746675 bytes, 965x1400) |  |  |  |
