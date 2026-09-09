# Extension Validation Report

- Extension: tachiyomi-pt.starlightscan-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7977736050206547443
- Source name: Starlight Scan
- Source language: pt-BR
- Selected manga input: latest offset 0: ⚠️AVISO⚠️ (`.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | ⚠️AVISO⚠️ (`.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Steampunk AU Christmas – My Hero Academia dj (`.../steampunk-au-christmas-my-hero-academia-dj`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 12 | ⚠️AVISO⚠️ (`.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ⚠️AVISO⚠️ (`.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ⚠️AVISO⚠️ (`.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | AVISO - LEIAM (`.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F <redacted query values: episodio>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=⚠️AVISO⚠️, URL=`.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://starligthscan.com/.../2_20260902_133301_0001.png` (image/png, 398576 bytes, 1080x1920) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E2%9A%A0%EF%B8%8Faviso%E2%9A%A0%EF%B8%8F` |  |  |  |
| details thumbnail URL | PASS | `https://starligthscan.com/.../2_20260902_133301_0001.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Olá estrelinhas! Bem, alguns de vocês já devem ter percebido que o site não anda sendo atualizado. Isso se deve ao fato de termos extrapolado o armazenamento do site, mas isso não quer dizer que paramos com a Scan. Inclusive continuamos atualizando, lançando e concluindo todas as sextas-feiras, porém tudo isso está sendo feito apenas no drive da Scan. Então caso vocês queiram continuar acompanhando nossos projetos, dêem uma olhada no nosso drive. Para acompanhar nossas atualizações siga a gente no Instagram @starlightyaoi, no nosso Instagram nos Destaques tem o link para o nosso TELEGRAM ou WHATSAPP, onde terá o link do nosso drive. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://starligthscan.com/.../1_20260902_133301_0000.png` (image/webp (encoding: lossy), 262360 bytes, 1080x1920) |  |  |  |
