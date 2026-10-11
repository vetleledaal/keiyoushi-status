# Extension Validation Report

- Extension: tachiyomi-fr.banchanscan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8593333389489308586
- Source name: Banchan Scan
- Source language: fr
- Selected manga input: popular offset 0: The Villainess Flips the Script (`.../webtoon_6e8e0117-9081-4c69-98b1-91fc831565ee`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Villainess Flips the Script (`.../webtoon_6e8e0117-9081-4c69-98b1-91fc831565ee`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Asha of the Borderlands (`.../webtoon_a91b05eb-3caa-4f0b-bc16-df48ee5e4496`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 9 | Portrait of Pride (`.../webtoon_b9874268-6207-4eb4-bfce-db9851ade5e1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Starting Over With The Dead You (`.../webtoon_30d7c01c-4c3c-42c6-8102-38301372a7d7`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Villainess Flips the Script (`.../webtoon_6e8e0117-9081-4c69-98b1-91fc831565ee`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Villainess Flips the Script (`.../webtoon_6e8e0117-9081-4c69-98b1-91fc831565ee`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 78 | Saison 1 · Chapitre 1 (`.../chapter_ac720f55-5e43-4d67-9b40-7017429e2a93`) |  | <1s |
| pages | `getPageList(chapter)` | success | 76 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Villainess Flips the Script, URL=`webtoon_6e8e0117-9081-4c69-98b1-91fc831565ee` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Starting Over With The Dead You, URL=`webtoon_30d7c01c-4c3c-42c6-8102-38301372a7d7` at page 1 offset 8 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.banchanscan.fr/.../cover-1790864820777.jpg` (image/jpeg, 89954 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `webtoon_6e8e0117-9081-4c69-98b1-91fc831565ee` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.banchanscan.fr/.../cover-1790864820777.jpg` |  |  |  |
| details author | PASS | KEN (켄) |  |  |  |
| details artist | PASS | Garine |  |  |  |
| details genres | PASS | Amour, Enfants, Famille, Familial, Fantastique, Romance, Romance fantasy, Villainess, Shojo |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Je me suis réveillée au cœur de mon roman préféré, non pas dans la peau du protagoniste, Luca Winterwald, mais dans celle de Judith, sa tante maltraitante, et le premier personnage à mourir… Il est temps de réécrire l’histoire ! Je vais confier Luca à son oncle aimant, qu’il n’a pas vu depuis longtemps, comme prévu dans le scénario, puis vivre ma propre vie loin de tout danger. Du moins, c’était le plan. Mais lorsque son oncle arrive, Luca s’écrie soudain : « Ne pars pas ! » Je dois désormais protéger Luca d’une tragédie familiale imminente, l’élever pour qu’il devienne le héros et bouleverser complètement la fin de cette méchante ! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 78 chapters |  |  |  |
| chapter dates | PASS | 78 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.banchanscan.fr/.../0001.webp` (image/webp (container: extended), 115732 bytes, 760x1000) |  |  |  |
