# Extension Validation Report

- Extension: tachiyomi-en.comicasura-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 499082788596590240
- Source name: Comic Asura
- Source language: en
- Selected manga input: popular offset 0: A Maid's Peaceful Life Behind Hidden Power (`.../a-maid-s-peaceful-life-behind-hidden-power`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | A Maid's Peaceful Life Behind Hidden Power (`.../a-maid-s-peaceful-life-behind-hidden-power`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Over Rev! (`.../over-revv`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | My Fake Girlfriend's Defending Against Their Attacks (`.../my-fake-girlfriends-defending-against-their-attacks`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | The Princess Has The Constitution Of An Eagle Workshop (`.../the-princess-has-the-constitution-of-an-eagle-workshop`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Maid's Peaceful Life Behind Hidden Power (`.../a-maid-s-peaceful-life-behind-hidden-power`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Maid's Peaceful Life Behind Hidden Power (`.../a-maid-s-peaceful-life-behind-hidden-power`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 39 | Chapter 0 (`.../chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Maid's Peaceful Life Behind Hidden Power, URL=`.../a-maid-s-peaceful-life-behind-hidden-power` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img-r1.2xstorage.com/.../a-maid-s-peaceful-life-behind-hidden-power.webp` (image/webp (encoding: lossy), 65102 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-maid-s-peaceful-life-behind-hidden-power` |  |  |  |
| details thumbnail URL | PASS | `https://img-r1.2xstorage.com/.../a-maid-s-peaceful-life-behind-hidden-power.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Drama, Fantasy, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The Hero Andert. A great swordsman who ended the Great War by sacrificing himself. One of the rare heroes… But he was actually a woman disguised as her dead younger brother. That was me. But… “Huh?” Did I just come back to life four years after my death? All I had was my body, so there was only one way to survive. Becoming a maid. “You’ve never worked as a maid before this, so what have you been doing all this time?” “Jobless.” “What motivated you to apply for this job?” “Money.” “What kind of mansion would you like to work in?” “A mansion that is so hard to work in and so nasty that we don’t even know if it’ll be cleaned if we both work and die.” “What kind of employer do you want?” “A vicious employer that terrorizes their employees.” That way I won’t get laid off since I’m the only one you can work with. “…” The interviewer looked at me like I was crazy. — Here, I will start anew. Not as the Hero Andert or my deceased little brother. But as the maid Daisy. **Original Webtoon:** \[KakaoPage\](https://page.kakao.com/.../68910610), \[Daum\](https://webtoon.kakao.com/.../4820) **Official Translations:** \[Japanese\](https://jp.piccoma.com/.../207216) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img-r1.2xstorage.com/.../0.webp` (image/webp (encoding: lossy), 42842 bytes, 1080x1500) |  |  |  |
