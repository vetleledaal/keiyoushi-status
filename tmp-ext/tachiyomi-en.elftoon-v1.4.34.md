# Extension Validation Report

- Extension: tachiyomi-en.elftoon-v1.4.34
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3896703921896511395
- Source name: Elf Toon
- Source language: en
- Selected manga input: latest offset 0: After All Eight Empresses Betrayed Me, I Was Reborn in Regret (`.../after-all-eight-empresses-betrayed-me-i-was-reborn-in-regret`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | The Butcher Blade That Pierces All Realms (`.../the-butcher-blade-that-pierces-all-realms`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Apocalypse Heat: I Become a King with My Safehouse (`.../apocalypse-heat-i-become-a-king-with-my-safehouse`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | After All Eight Empresses Betrayed Me, I Was Reborn in Regret (`.../after-all-eight-empresses-betrayed-me-i-was-reborn-in-regret`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Permanently One HP, Yet I’m Still Invincible (`.../permanently-one-hp-yet-im-still-invincible`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | After All Eight Empresses Betrayed Me, I Was Reborn in Regret (`.../after-all-eight-empresses-betrayed-me-i-was-reborn-in-regret`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | After All Eight Empresses Betrayed Me, I Was Reborn in Regret (`.../after-all-eight-empresses-betrayed-me-i-was-reborn-in-regret`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 37 | Chapter 1 (`.../after-all-eight-empresses-betrayed-me-i-was-reborn-in-regret-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=After All Eight Empresses Betrayed Me, I Was Reborn in Regret, URL=`.../after-all-eight-empresses-betrayed-me-i-was-reborn-in-regret` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../thumbnail.webp` (image/jpeg, 24212 bytes, 226x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../after-all-eight-empresses-betrayed-me-i-was-reborn-in-regret` |  |  |  |
| details thumbnail URL | PASS | `https://i2.wp.com/.../thumbnail.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Cultivation, Fantasy, Harem, Martial arts, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lu Ye, once hailed across the realms as the Nine-Lives Celestial Venerable. Yet on the very day he ascended… the eight Empresses he had raised, protected, and trusted turned on him. Nine Heavens Sword Maiden: “Because of you, the world sneers at me as nothing but a Sword Slave!” Fairy Hong Ling: “If not for you, I would’ve become his divine companion long ago! You deserve to die!” Vermilion Bird Demon Empress: “You warned me they’d hurt me… but the only one who truly wounded me was you!” But fate rewinds, granting Lu Ye a second life. And this time, he refuses to walk the same doomed path. He won’t sacrifice everything for them again. Let the eight of them fend for themselves.<br><br>Alternative Names: 八女帝全背叛，重生悔到肠断 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 37 chapters |  |  |  |
| chapter dates | PASS | 37 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://elftoon.xyz/.../01-120.webp` (image/webp (encoding: lossy), 2883762 bytes, 800x11135) |  |  |  |
