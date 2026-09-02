# Extension Validation Report

- Extension: tachiyomi-en.manhwacomics-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 24
- Lint: 0
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3386088694317815151
- Source name: Manhwa Comics
- Source language: en
- Selected manga input: popular offset 0: The BJ Manager Who Boosts His Favorability (`.../206`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The BJ Manager Who Boosts His Favorability (`.../206`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | The Player (`.../2442`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | I’ll Eat Your Mom First (`.../748`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | I Was the One Who Got Hypnotized but I Made an Idol Harem (`.../2471`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The BJ Manager Who Boosts His Favorability (`.../206`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The BJ Manager Who Boosts His Favorability (`.../206`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The BJ Manager Who Boosts His Favorability, URL=`206` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwacomics.com/.../The-BJ-Manager-Who-Boosts-His-Favorability-350x476.webp` (image/webp (encoding: lossless), 216640 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `206` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwacomics.com/.../The-BJ-Manager-Who-Boosts-His-Favorability-193x278.webp` (image/webp (encoding: lossless), 75666 bytes, 193x278) |  |  |  |
| details author | PASS | Daengdaengcon, Matsogeum |  |  |  |
| details artist | PASS | Matsogeum |  |  |  |
| details genres | PASS | Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Description of The BJ Manager Who Boosts His Favorability Manhwa<br><br>“You’re only a manager…” “Who do you think you are, acting so cool?” Kwon Seojun becomes her manager because he wants to meet his favorite BJ Seoyeon personally. However, contrary to his expectations, he is subjected to repeated power trips and abuse, and each day is agonizing. He then turns on her, making derogatory comments about her. Then one day. The Favorability Boost app opens.<br><br>The app’s purpose is to XX Seoyeon.<br><br>The BJ Manager Who Improves His Favorability Manhwa is also known as 호감작 하는 인방 매니저. This ongoing webtoon debuted in 2024. Daengdaengcon and Matsogeum wrote this series, which Matsogeum illustrated. The BJ Manager Who Boosts His Favorability Webtoon is a mature, romantic story.<br><br>Read the latest Manhwa. The BJ Manager Who Boosts His Favorability has all chapters in English at Manhwa Comics. Manhwa Comics is constantly updating Manhwa The BJ Manager Who Boosts His Favorability. Don’t forget to read the remaining Manhwa updates. The All Manhwas List menu has a list of Manhwa collections and comics. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
