# Extension Validation Report

- Extension: tachiyomi-en.mangaplaza-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2236200885810873895
- Source name: MangaPlaza
- Source language: en
- Selected manga input: popular offset 0: Your Grace, Please Just Forget About This Wicked Wife! (`.../0303012901`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Your Grace, Please Just Forget About This Wicked Wife! (`.../0303012901`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Sharing This Brilliantly Colored World With You (`.../0303012219`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | I'm a Villainess to be Poisoned, so Why am I Being Adored?-Full Color (`.../0303007026`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Bride of a Fox (`.../0303013357`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Your Grace, Please Just Forget About This Wicked Wife! (`.../0303012901`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Your Grace, Please Just Forget About This Wicked Wife! (`.../0303012901`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | #1 (`.../103030129010001`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 51 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Your Grace, Please Just Forget About This Wicked Wife!, URL=`0303012901` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c.mangaplaza.com/.../103030129010001.jpg` (image/jpeg, 66776 bytes, 330x469) |  |  |  |
| details identity | PASS | Details preserved selected URL `0303012901` |  |  |  |
| details thumbnail URL | PASS | `https://c.mangaplaza.com/.../103030129010001.jpg` |  |  |  |
| details author | PASS | Mika Sakurano, Kotoko |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Romance, Josei, Only on MangaPlaza |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "You'll just have to hold out until the sunrise again," he murmurs, looking at me with such adoring eyes... but wasn't I supposed to be the wicked wife he hates?! Much to her surprise, our hero woke up one day as Ilse, the meddling and evil wife from a novel she once read. In the story, Ilse tries to come between the protagonist Gilbert and his beloved, only to end up trapped in a brothel with nothing to her name. Now, hoping to change the original plot, this new Ilse decides to get herself an amicable divorce from Gilbert. After all, if she can just avoid the tragic ending that's coming for her, life in this world might be kind of fun! Her plans come skidding to a stop, though, when Gilbert strides into her bedroom late that night. Poor Ilse is soon in over her head, suffering one indignity after the next at the (talented) hands of this coldly sadistic duke, and she just might be falling head over heels in the process... Come let this luxuriously dramatic fantasy romcom sweep you off your feet! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://reader.mangaplaza.com/.../crUXUEFC.jpg <redacted query values: dmytime, u0, and u1>` (image/jpeg, 902267 bytes, 1441x2048) |  |  |  |
