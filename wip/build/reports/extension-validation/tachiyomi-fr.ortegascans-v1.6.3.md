# Extension Validation Report

- Extension: tachiyomi-fr.ortegascans-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8598370605081191622
- Source name: Ortega Scans
- Source language: fr
- Selected manga input: popular offset 0: Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Potential Husband of The World Tree (`.../potential-husband-of-the-world-tree`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Childhood Friend (`.../childhood-friend`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Late-night Show Climax (`.../late-night-show-climax`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Chapitre 1 (`.../cmuogd05102pv0nl49yd939si`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Absolute Hypnosis in Another World, URL=`absolute-hypnosis-in-another-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://ortegascans.fr/.../absolute-hypnosis-in-another-world_a8bc38ea.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `absolute-hypnosis-in-another-world` |  |  |  |
| details thumbnail URL | PASS | `https://ortegascans.fr/.../absolute-hypnosis-in-another-world_a8bc38ea.webp` |  |  |  |
| details author | PASS | Grilled Mero |  |  |  |
| details artist | PASS | Grilled Mero |  |  |  |
| details genres | PASS | Action, Comédie, Drame, Fantasy, Hardcore, Romance, Slice of Life, Isekai |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Après une session de branlette intensive sur du hentai notre personnage principal meurt d’une crise cardiaque , il se voit accorder par une entité inconnu la possibilité de choisir 2 compétences de son choix avant de se faire réincarner dans un monde de fantasy. Perdu dans ce nouveau monde et traqué par une bête féroce il se retrouve sauvé par un chasseur local, pour le remercier il compte bien profiter au maximum de cette opportunité avec sa femme et peut-être même plus…<br><br>Noms alternatifs : Hypnose absolue dans l’autre monde, Zettai ni Yatte wa Ikenai Isekai Shoukan, 絶対にヤッてはいけない異世界召喚, Absolutely Do Not Have XXX in the Other World, 绝对不能做的异世界召唤, Do It or Die |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | PASS | 85 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://ortegascans.fr/.../absolute-hypnosis-in-another-world` to `https://ortegascans.fr/.../absolute-hypnosis-in-another-world <redacted query values: _rsc>` (1 redirects); popular: `https://ortegascans.fr/.../1` to `https://ortegascans.fr/.../1 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://ortegascans.fr/.../1.webp` (image/png, 12546713 bytes, 600x30194; server Content-Type: image/webp) |  |  |  |
