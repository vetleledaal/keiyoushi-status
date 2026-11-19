# Extension Validation Report

- Extension: tachiyomi-all.achymanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 2311891545723109443
- Source name: AchyManga
- Source language: en
- Selected manga input: latest offset 0: Reincarnated as a Heretic Mob in an Eroge Where Everyone Is Insane (`.../mob-cultist-eroge-en`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | Reincarnated as a Heretic Mob in an Eroge Where Everyone Is Insane (`.../mob-cultist-eroge-en`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 3 | Reincarnated as a Heretic Mob in an Eroge Where Everyone Is Insane (`.../mob-cultist-eroge-en`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reincarnated as a Heretic Mob in an Eroge Where Everyone Is Insane (`.../mob-cultist-eroge-en`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reincarnated as a Heretic Mob in an Eroge Where Everyone Is Insane (`.../mob-cultist-eroge-en`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Ch. 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reincarnated as a Heretic Mob in an Eroge Where Everyone Is Insane, URL=`.../mob-cultist-eroge-en` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 7/7 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 7/7 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.achymanga.online/.../cover.webp` (image/webp (encoding: lossy), 78722 bytes, 600x894) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mob-cultist-eroge-en` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.achymanga.online/.../cover.webp` |  |  |  |
| details author | PASS | Heaven99 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Fantasy, Isekai, Ecchi, Harem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After unexpectedly reincarnating as an insignificant low-tier cultist mob in the perilous world of a fantasy eroge where all characters are completely deranged and ready to go all out, the protagonist must rely on his keen wits and deep gaming knowledge to survive lethal and hilarious daily insanity.<br><br>**Alternative Names:**<br>- 全員覚悟ガンギマリなエロゲーの邪教徒モブに転生してしまった件<br>- Zen'in Kakugo Gangimari na Eroge no Jakyouto Mob ni Tensei shiteshimatta Ken<br>- The Case of Reincarnating as a Mob Cultist in an Eroge Where Everyone Is Ready to Go All Out<br>- Reincarnated as a Heretic Mob... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.achymanga.online/.../001.webp <redacted query values: v and s>` (image/jpeg, 181867 bytes, 836x1188) |  |  |  |
