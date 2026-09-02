# Extension Validation Report

- Extension: tachiyomi-en.lhtranslation-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8802607595629671202
- Source name: LHTranslation
- Source language: en
- Selected manga input: popular offset 0: Maou ni Natta node, Dungeon Tsukutte Jingai Musume to Honobono suru (`.../1885`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Maou ni Natta node, Dungeon Tsukutte Jingai Musume to Honobono suru (`.../1885`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Makikomarete Isekai Teni suru Yatsu wa, Taitei Cheat (`.../1866`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Maou ni Natta node, Dungeon Tsukutte Jingai Musume to Honobono suru (`.../1885`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Gaikotsu Kishi-sama Tadaima Isekai e o Dekake-chuu (`.../1889`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Maou ni Natta node, Dungeon Tsukutte Jingai Musume to Honobono suru (`.../1885`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Maou ni Natta node, Dungeon Tsukutte Jingai Musume to Honobono suru (`.../1885`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 139 | Chapter 1.1 (`.../chapter-1-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Maou ni Natta node, Dungeon Tsukutte Jingai Musume to Honobono suru, URL=`1885` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lhtranslation.net/.../maou-ni-natte-node-dungeon-tsukutte-jingai-musume-to-honobono-suru.jpg` (image/jpeg, 215508 bytes, 812x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `1885` |  |  |  |
| details thumbnail URL | PASS | `https://lhtranslation.net/.../maou-ni-natte-node-dungeon-tsukutte-jingai-musume-to-honobono-suru.jpg` |  |  |  |
| details author | PASS | Ryuuyuu |  |  |  |
| details artist | PASS | Ryuuyuu |  |  |  |
| details genres | PASS | Action, Comedy, Fantasy, Harem, Shounen, LHTranslation, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Before I realized, I had become the guardian of a dungeon, a Demon Lord. I was suddenly in a dangerous world with giant monsters loitering around, fighting for their existence, so I thought to go about developing the dungeon in order to not die but —- for some reason I was having quite the good time…. How did it turn out like this?<br><br>The protagonist, Yuki, having to live in that world now, uses his bold and sharp senses and spends time with a supreme dragon girl and a vampire girl; Sometimes laughing, sometimes being angry, passing days doing what he likes.<br><br>Alternative Names: A Demon Lord’s Tale: Dungeons, Monster Girls, and Heartwarming Bliss, I Became the Demon Lord so I Created a Dungeon and Spend Heartwarming Time There with Non-Human Girls, 마왕이 됐으므로 던전을 만들고 인외아가씨와 훈훈해진다, 魔王になったので、ダンジョン造って人外娘とほのぼのする, 魔王建造地下城转生到异世界建造人外娘 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 139 chapters |  |  |  |
| chapter dates | LINT | 26 of 139 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=26 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lhtranslation.net/.../v01-c001---001.jpg` (image/jpeg, 932794 bytes, 1000x1400) |  |  |  |
