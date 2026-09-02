# Extension Validation Report

- Extension: tachiyomi-id.noromax-v1.4.37
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2636071300407720294
- Source name: Noromax
- Source language: id
- Selected manga input: latest offset 0: The Eight Empresses Betrayed Me, Only to Deeply Regret It After Being Reborn Bahasa Indonesia (`.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | All Hail the Sect Leader Bahasa Indonesia (`.../all-hail-the-sect-leader-bahasa-indonesia`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Top Tier Providence: Secretly Cultivate for a Thousand Years Bahasa Indonesia (`.../top-tier-providence-secretly-cultivate-for-a-thousand-years-bahasa-indonesia`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Eight Empresses Betrayed Me, Only to Deeply Regret It After Being Reborn Bahasa Indonesia (`.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn-bahasa-indonesia`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | I’m Trapped in This Day for One Thousand Years Bahasa Indonesia (`.../im-trapped-in-this-day-for-one-thousand-years-bahasa-indonesia`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Eight Empresses Betrayed Me, Only to Deeply Regret It After Being Reborn Bahasa Indonesia (`.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn-bahasa-indonesia`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Eight Empresses Betrayed Me, Only to Deeply Regret It After Being Reborn Bahasa Indonesia (`.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn-bahasa-indonesia`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 38 | Chapter 01 (`.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn-chapter-01-bahasa-indonesia`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Eight Empresses Betrayed Me, Only to Deeply Regret It After Being Reborn Bahasa Indonesia, URL=`.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn-bahasa-indonesia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://noromax02.my.id/.../The-Eight-Empresses-Betrayed-Me_noromax-228x300.webp` (image/webp (encoding: lossy), 17996 bytes, 228x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn-bahasa-indonesia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://noromax02.my.id/.../The-Eight-Empresses-Betrayed-Me_noromax.webp` (image/webp (encoding: lossy), 18614 bytes, 285x375) |  |  |  |
| details author | PASS | Le Feng |  |  |  |
| details artist | PASS | Le Feng |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Harem, Romance, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lu Ye, Nine-Lives Heavenly Sovereign yang dikagumi semua orang, pada hari dia naik ke alam Immortal, justru dikhianati oleh delapan Empress yang dibesarkannya sendiri. Nine Heavens Sword Princess: “Karena kau, seluruh dunia memanggilku sebagai pelayanmu!” Fairy Hong Ling: “Kalau bukan karena kau, aku sudah menjadi pasangan abadi dengannya. Kau pantas mati!” Vermilion Demon Empress: “Kau bilang mereka yang menyakitiku? Justru yang menyakitiku adalah dirimu sendiri!” Dengan Space-Time Reversal, Lu Ye terlahir kembali. Di kehidupan baru ini, dia bersumpah tidak akan mengulangi kesalahan yang sama, dan membiarkan delapan wanita itu menghadapi nasib mereka sendiri!<br><br>Alternative Names: Betrayed by Eight Empresses, They Now Regret After Rebirth, All Eight Empresses Betrayed Me: Reborn, They Regret It to the Point of Heartbreak, 八女帝全背叛，重生悔到肠断 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001_noromax.webp` (image/jpeg, 146106 bytes, 720x1080) |  |  |  |
