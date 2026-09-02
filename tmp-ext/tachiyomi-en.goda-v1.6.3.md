# Extension Validation Report

- Extension: tachiyomi-en.goda-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4273874799952447458
- Source name: Goda
- Source language: en
- Selected manga input: popular offset 0: A Returner's Magic Should Be Special (`.../00-a-returner-s-magic-should-be-special`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | A Returner's Magic Should Be Special (`.../00-a-returner-s-magic-should-be-special`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Legendary Youngest Son of the Marquis House (`.../legendary-youngest-son-of-the-marquis-house-manhwa`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Damn Reincarnation (`.../02-damn-reincarnation`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Katatsumuri-chan (`.../katatsumuri-chan`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | A Returner's Magic Should Be Special (`.../00-a-returner-s-magic-should-be-special`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Returner's Magic Should Be Special (`.../00-a-returner-s-magic-should-be-special`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 262 | Chapter 1 (`.../19055_1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 79 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Returner's Magic Should Be Special, URL=`00-a-returner-s-magic-should-be-special` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://all1.chapt.top/.../dyJez.webp` (image/webp (encoding: lossy), 54728 bytes, 400x572) |  |  |  |
| details identity | PASS | Details preserved selected URL `00-a-returner-s-magic-should-be-special` |  |  |  |
| details thumbnail URL | PASS | `https://all1.chapt.top/.../dyJez.webp` |  |  |  |
| details author | PASS | Usonan (유소난) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Hots, Action, Fantasy, Adventure, Magic, Comedy, Adaptation, MartialArts, LongStrip, WebComic, FullColor |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "Now that I'm back, I won't allow my loved ones to die again!" The Shadow Labyrinth - the deadliest catastrophe humanity has ever known. Desir Arman, one of the six remaining survivors of mankind, is inside the Labyrinth. The six of them attempt to clear the final level of the Labyrinth but ultimately fail, and the world comes to an end. However, when Desir thought he would meet his demise, what appears before him is the world… thirteen years ago?! Desir is returned to the past, back to the time when he enrolled at the nation's finest magic academy, Havrion. He is reunited with his precious friends, and he is determined to change the past to save the world and his loved ones…! Three years remain before the emergence of the Shadow World! Change the past and gather powerful comrades to save mankind!---- \[1st Trailer\](https://www.youtube.com/.../watch <redacted query values: v>) \| \[ENG\](https://www.youtube.com/.../watch <redacted query values: v>) \| \[JP\](https://www.youtube.com/.../watch <redacted query values: v>) \| \[Renewal\](https://www.youtube.com/.../watch <redacted query values: v>)- \[2nd Trailer\](https://www.youtube.com/.../watch <redacted query values: v>)---- \[Original Book \](http://www.yes24.com/.../96273480)- \[Original Book \](https://www.aladin.co.kr/.../wproduct.aspx <redacted query values: ItemId>)&gt;- \[Book \](https://altraverse.de/.../a-returner-s-magic-should-be-special)- \[Book \](https://www.kadokawa.co.jp/.../322104000234)<br><br>ID: 1 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 262 chapters |  |  |  |
| chapter dates | LINT | All 262 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=262 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://f03-wt.chapt.top/.../0-mgsearch.webp` could not be downloaded: kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
