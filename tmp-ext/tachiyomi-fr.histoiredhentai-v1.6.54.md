# Extension Validation Report

- Extension: tachiyomi-fr.histoiredhentai-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6899189456839494153
- Source name: HistoireDHentai
- Source language: fr
- Selected manga input: latest offset 0: Milf Hunting In Another World (`.../13862`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Stepmother’s Friends (`.../6617`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Milf Hunting In Another World (`.../13862`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Milf Hunting In Another World (`.../13862`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Milf Hunting In Another World (`.../13862`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Chapitre 1 (`.../chapitre-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Milf Hunting In Another World, URL=`13862` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-9b104fb2e07640bcb74620f75f1596d2.r2.dev/.../milf-hunting-in-another-world.webp` (image/webp (encoding: lossy), 53986 bytes, 640x896) |  |  |  |
| details identity | PASS | Details preserved selected URL `13862` |  |  |  |
| details thumbnail URL | PASS | `https://pub-9b104fb2e07640bcb74620f75f1596d2.r2.dev/.../milf-hunting-in-another-world.webp` |  |  |  |
| details author | PASS | Oh gok Jeon do sa |  |  |  |
| details artist | PASS | ERO404 |  |  |  |
| details genres | PASS | Action, Aventure, Fantasy, Harem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Après avoir été attrapé pendant qu’il avait une relation intime avec une MILF, Taeyang s’est échappé dans un autre monde. Partager le lit avec une MILF possédant un corps incroyable ?! Bon Appétit ! Taeyang pourra-t-il créer son propre harem dans ce monde, et ce en toute sécurité ?Action Aventure Harem Fantaisie<br><br>Alternative Names: Cazador de milfs de otro mundo \| Different World Milf Hunter \| Milf Hunter in Another World \| Milf Hunter From Another World \| 人妻獵人 \| 이세계 밀프 헌터 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.hhentai.fr/.../001.webp` (image/jpeg, 681951 bytes, 720x8232; server Content-Type: image/webp) |  |  |  |
