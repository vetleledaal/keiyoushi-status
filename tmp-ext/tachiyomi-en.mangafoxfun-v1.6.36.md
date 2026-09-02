# Extension Validation Report

- Extension: tachiyomi-en.mangafoxfun-v1.6.36
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8144054169452081697
- Source name: MangaFox.fun
- Source language: en
- Selected manga input: popular offset 0: Onepunch-man (`.../onepunch-man_117`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Onepunch-man (`.../onepunch-man_117`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Arifureta Shokugyou De Sekai Saikyou (`.../arifureta-shokugyou-de-sekai-saikyou`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Satanofani (`.../satanofani`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Pani Poni (`.../pani-poni`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Onepunch-man (`.../onepunch-man_117`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Onepunch-man (`.../onepunch-man_117`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 292 | Chapter 1 - One Punch (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Onepunch-man, URL=`.../onepunch-man_117` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../onepunch-man.jpg` (image/jpeg, 34378 bytes, 200x301) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../onepunch-man_117` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../onepunch-man.jpg` |  |  |  |
| details author | PASS | ONE |  |  |  |
| details artist | PASS | Murata Yuusuke |  |  |  |
| details genres | PASS | Sci-Fi, Action, Comedy, Superhero, Monsters, Martial Arts, Supernatural, Gore, Award Winning, Seinen, Suggestive, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | imitates the life of an average hero who wins all of his fights with only one punch! This is why he is called Onepunch man Manga. This story takes place in the fictional Z-City. The world is full of mysterious beings, villains and monsters that cause destruction and havoc. An association of heroes has been established to protect the citizens from all harms and enemies. People with superhuman ability can register themselves with the association that protects citizens. There, they will be required to take a series of tests to determine their ability and what class they are. Class S being the highest and class C being the lowest.<br><br><br><br>Saitama is the titular Onepunch man Manga that is so powerful that he can defeat very powerful monsters and villains in just a single punch. Ironically, his life is boring because he is a superhero. The fact that he is so strong and powerful proved to be boring to him as hell.<br><br>There are a lot of characters in the manga Onepunch man Manga is our favourite in this. Heroes and villains have interesting abilities and very powerful personalities. However, most of them heroes and villain are featured as background and support characters.<br><br><br><br>He used to be your typical Salaryman. He is middle aged and lived a rather boring and normal life. One day he saw a kid being attacked by one of the giant monster lobster. He helped the kid and somehow defeated the monster.<br><br>From that very day, he decided to become a hero. He chose to train every single day for three years. He was very determined. He trained with an all inhuman’ workout routine of 100 push-ups , 100 sit-ups, 100 squats and 10 kilometers running and eventually gaining superhuman strength and speed. He also lost his hair. Saitama is an amusing and entertaining protagonist. <br><br><br><br><br><br>Genos is a cybog and he saw Saitama’s capabilities and assigned himself as his student. He’s become a hero to revenge against a mysterious robot that killed his entire family. He follows Saitama to gain the strength he needed to achieve his goals.<br><br>Other attractive Manga:<br><br>Alternative Names:<br>- ВанПанчМен<br>- ワンパンマン<br>- 一拳超人<br>- One Punch Man<br>- One-Punch Man<br>- Onepunchman<br>- رجل اللكمة الواحدة |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 292 chapters |  |  |  |
| chapter dates | PASS | 292 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 1857323 bytes, 4480x2050) |  |  |  |
